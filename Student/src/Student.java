public class Student {
    private String name;
    private String nationality;
    private int studyNumber;

    public Student(String name, String nationality, int studyNumber) {
        this.name = name;
        this.nationality = nationality;
        this.studyNumber = studyNumber;
    }

    public Student(String name, int studyNumber) {
        this.name = name;
        this.studyNumber = studyNumber;
        this.nationality = null;
    }

    public void setName(String name) {
        if (name.equals("") || name == null) {
            this.name = "Unknown";
        } else {
            this.name = name;
        }
    }

    public void setNationality(String nationality) {
        if (nationality.length() != 2) {
            this.nationality = null;
        } else {
            this.nationality = nationality;
        }
    }

    public void setStudyNumber(int studyNumber) {
        this.studyNumber = studyNumber;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public int getStudyNumber() {
        return studyNumber;
    }

    public boolean hasAKnownNationality() {
        return nationality != null;
    }

    public boolean hasSameNationalityAs(Student other) {
        return other.getNationality().equals(this.getNationality());
    }

    @Override
    public String toString() {
        String result = "";
        if (name != null) {
            result += getName();
        }
        if (nationality != null) {
            result += " (" + getNationality() + ") ";
        }
        return result + "," + studyNumber;
    }
}
