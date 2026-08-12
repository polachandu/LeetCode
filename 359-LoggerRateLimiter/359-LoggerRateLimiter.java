// Last updated: 8/12/2026, 11:15:07 AM
class Logger {
    HashMap<String, Integer> expiry;


    public Logger() {
        expiry = new HashMap<String, Integer>();
    }
    
    public boolean shouldPrintMessage(int timestamp, String message) {
        if(!expiry.containsKey(message)){
            expiry.put(message, timestamp);
            return true;
        }

        Integer oldTimestamp = expiry.get(message);
        if(timestamp - oldTimestamp >= 10){
            expiry.put(message, timestamp);
            return true;
        } else{
            return false;
        }
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */