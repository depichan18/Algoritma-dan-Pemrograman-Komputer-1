public class ProjectGame {
    public static void main(String[] args) {

        //karakter 1
        String char1 = "depi";
        int health1 = 100;

        //karakter 2
        String char2 = "farellaho";
        int health2 = 100;

        //serangan random acak
        int loop = 1;
        while (loop == 1){
            
            int attack_power1 = (int) (10 + Math.random() * 41);
            int attack_power2 = (int) (10 + Math.random() * 41);
            
            health1 = health1 - attack_power1;
            health2 = health2 - attack_power2;
            
            System.out.println(char1 +" telah menerima serangan sebesar " + attack_power1);
            System.out.println("sisa nyawanya sekarang adalah "+ health1);
            System.out.println(char2 + "telah menerima serangan sebesar" + attack_power2);
            System.out.println("sisa nyawanya sekarang adalah "+ health2);


            if (health1 <= 0 || health2<= 0) {
                if (health1 <= 0) {
                    System.out.println(char2 + " menang");
                }
                else if (health2 <= 0) {
                    System.out.println(char1 + " menang");
                }
                loop = 0;

            }
        }
    }
}