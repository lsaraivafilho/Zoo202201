/**
 * Leonardo Saraiva Filho - lsaraivafilho
 * 202102 CIS175 13413
 * 9/2/2021
 */
public class Wolf {
        private String Name;
        private int Age;
        private String Breed;

        public Wolf(){
        }
        public Wolf(String name, int age, String breed){
            this.Name = name;
            this.Age = age;
            this.Breed = breed;
        }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getBreed() {
        return Breed;
    }

    public void setBreed(String breed) {
        Breed = breed;
    }
    @Override
    public String toString(){
            return "Wolf [Name=" + Name + ", Age =" + Age + ", Breed=" + Breed + "]";
    }
    public String speak(){
            return "howl";
    }
}
