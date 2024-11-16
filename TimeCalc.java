public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutestoAdd = Integer.parseInt(args[1]);
        int totalMinuts = (hours * 60) + minutes + minutestoAdd;
        int totalHours = totalMinuts / 60;
        int newHours = totalHours % 24;
        int newMinuts = totalMinuts - (totalHours * 60);

        if (newHours < 10)
        {
            if (newMinuts < 10){
                System.out.println( "0" + newHours + ":" + newMinuts );       
            } else {
                System.out.println("0" + newHours + ":" + newMinuts);
            }
                
        } else {
            if (newMinuts < 10){
                System.out.println(newHours + ":" + "0" + newMinuts);
            } else {
                System.out.println(newHours + ":" + newMinuts);
            }
        }



    }
}
