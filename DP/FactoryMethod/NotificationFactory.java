public class NotificationFactory {

    public Notification createNotification(String channelString)
    {
        if (channelString == null || channelString.isEmpty())
            return null;
        switch (channelString) {
            case "SMS":
                return new SMSNotification();
            case "EMAIL":
                return new EmailNotification();
            case "PUSH":
                return new PushNotification();
            default:         
                throw new IllegalArgumentException("Unknow channel " + channelString);
        }
    }
}