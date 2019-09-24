public class Person {
    private String name;
    private String martialStatus;
    private int numberOfChildren;

    public Person(String name) {
        this.name = name;
        this.martialStatus = "Single";
        this.numberOfChildren = 0;
    }

    public void setMartialStatus(String status) {
        if (!status.equals("Single") || !status.equals("Married")) {
            this.martialStatus = "";

        } else {
            this.martialStatus = status;
        }
    }

    public void addChild() {
        this.numberOfChildren++;
    }

    public boolean isSingle() {
        return this.martialStatus.equals("Single") || this.martialStatus.equals("Married");
    }

    @Override
    public String toString() {
        String s = this.name + ", " + this.martialStatus + ", ";
        if (this.numberOfChildren == 1) {
            s += "1 child";
        } else
            s += this.numberOfChildren + " children";
        return s;
    }
}
