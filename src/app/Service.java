package app;
class Service {

     double number;
     double percent;
     double rate;

     Service(double win) {
         number = win;
     }
     public double calcSum() {
         if (number < 3)
             rate = 125;
         else if (number <= 7)
             rate = 125;
         else if (number > 7)
             rate = 250;
         return number * rate;
     }

     double calcPersent() {
         if (number < 3)
             percent = 0;
         else if (number <= 7)
             percent = 5;
         else if (number > 7)
             percent = 10;
         return rate / 100 * percent;
     }


}
