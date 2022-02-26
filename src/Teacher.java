public class Teacher extends Person{
    private Profession profession;

    public Teacher(String name) {
        super(name);
        this.profession = Profession.values()[FactoryUtils.ranNumber(0, 5)];
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Profession:" + profession + ' ' + super.toString();
    }
}
