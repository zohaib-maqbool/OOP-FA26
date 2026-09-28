public class Time {
    int hr = 0;
    int min = 0;
    int seconds = 0;

    public Time(){
        System.out.println("Running Constructor without arguments...");
    }

    public Time(int hr, int min, int seconds) {
        if (hr >= 0 && hr <= 24 && min >= 0 && min <= 60 && seconds >= 0 && seconds <= 60){
            this.hr = hr;
            this.min = min;
            this.seconds = seconds;
        }else{
            System.out.println("Hours should be between 0-24\n" +
                    "Minutes should be between 0-60\n" +
                    "Seconds should be between 0-60");
            System.out.printf("Your entered time is [HH:MM:SS]: %d:%d:%d \n",hr,min,seconds);
            return;
        }
    }
    public void displayTime(){
        System.out.printf("Time [HH:MM:SS]: %d:%d:%d",hr,min,seconds);
    }
}