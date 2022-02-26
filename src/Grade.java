public class Grade {
    private Profession profession;
    private int score;

    public Grade(Profession profession) {
        this.profession = profession;
        this.score = FactoryUtils.ranNumber(40,100);
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString(){
        return "Profession:" + profession + ", Score: " + score + '\n';
    }
}
