

class ClgStudent  {
    int roll;
    String name;
    int engMarks;
    int marMarks;
    int mathMarks;
    int sciMarks;
    int geoMarks;
    double total;

    public double total(int engMarks, int marMarks, int mathMarks, int sciMarks, int geoMarks){
        return ((engMarks + marMarks + mathMarks + sciMarks + geoMarks)*100)/500;
    }

    public ClgStudent(int roll, String name, int engMarks, int marMarks, int mathMarks, int sciMarks, int geoMarks) {
        this.roll = roll;
        this.name = name;
        this.engMarks = engMarks;
        this.marMarks = marMarks;
        this.mathMarks = mathMarks;
        this.sciMarks = sciMarks;
        this.geoMarks = geoMarks;
        this.total = total(engMarks, marMarks, mathMarks, sciMarks, geoMarks);
    }

}