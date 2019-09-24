public class Grade {
    private int grade;

    public Grade(int grade) {
        if(grade<-3 || grade >12){
            this.grade=-3;
        }else{
            this.grade = grade;
        }

    }

    public Grade(String ectsGrade) {
        ectsGrade.toUpperCase();
        switch (ectsGrade){
            case "A": this.grade=12;
            case "B": this.grade=10;
            case "C": this.grade=7;
            case "D": this.grade=4;
            case "E": this.grade=2;
            case "FX": this.grade=0;
            case "F": this.grade=-3;
            default:this.grade=-3;
        }
    }
    public int getGrade(){
        return grade;
    }
    public String getEctsGrade(){
        switch (this.grade){
            case 12:return "A";
            case 10:return "B";
            case 7:return "C";
            case 4:return "D";
            case 2:return "E";
            case 0:return "Fx";
            default:return "F";
        }
    }

    @Override
    public String toString() {
        return "Grade DK:" +getGrade()+ " Grade Int:" + getEctsGrade();
    }
}
