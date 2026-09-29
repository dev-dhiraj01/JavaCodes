#include <stdio.h>
#include <string.h>

void xorOperation(char *dividend, const char *divisor, int len) {
    for (int i = 1; i < len; i++)
        dividend[i] = (dividend[i] == divisor[i]) ? '0' : '1';
}

void crcEncode(const char *data, const char *divisor, char *encoded) {
    int dataLen = strlen(data);
    int divisorLen = strlen(divisor);
    char temp[100];

    // Copy data and append zero bits
    strcpy(encoded, data);
    for (int i = 0; i < divisorLen - 1; i++)
        strcat(encoded, "0");

    strncpy(temp, encoded, divisorLen);

    for (int i = divisorLen; i <= dataLen + divisorLen - 1; i++) {
        if (temp[0] == '1')
            xorOperation(temp, divisor, divisorLen);

        // Shift left and bring next bit
        for (int j = 0; j < divisorLen - 1; j++)
            temp[j] = temp[j + 1];
        temp[divisorLen - 1] = encoded[i];
    }

    // Append remainder to data
    strncpy(encoded + dataLen, temp, divisorLen - 1);
    encoded[dataLen + divisorLen - 1] = '\0';
}

int crcCheck(const char *received, const char *divisor) {
    int rlen = strlen(received);
    int dlen = strlen(divisor);
    char temp[100];
    strncpy(temp, received, dlen);

    for (int i = dlen; i <= rlen; i++) {
        if (temp[0] == '1')
            xorOperation(temp, divisor, dlen);

        // Shift left and bring next bit
        for (int j = 0; j < dlen - 1; j++)
            temp[j] = temp[j + 1];
        temp[dlen - 1] = received[i];
    }

    // If remainder is all zero, no error
    for (int i = 0; i < dlen - 1; i++) {
        if (temp[i] != '0')
            return 0; // error detected
    }
    return 1; // no error
}

int main() {
    char data[100], divisor[20], encoded[200];

    printf("Enter binary data: ");
    scanf("%s", data);
    printf("Enter generator (divisor): ");
    scanf("%s", divisor);

    crcEncode(data, divisor, encoded);
    printf("Transmitted codeword: %s\n", encoded);

    // Simulate receiving (you may modify to simulate error)
    char received[200];
    strcpy(received, encoded); // For now, assume no error

    printf("Enter received data (for checking): ");
    scanf("%s", received);

    if (crcCheck(received, divisor))
        printf("No error detected.\n");
    else
        printf("Error detected in received data.\n");

    return 0;
}
