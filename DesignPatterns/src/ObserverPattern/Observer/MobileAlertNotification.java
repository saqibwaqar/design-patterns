package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class MobileAlertNotification implements NotificationAlertObserver {

    StocksObservable stocksObservable;
    String user;

    public MobileAlertNotification(String user, StocksObservable stocksObservable) {
        this.stocksObservable = stocksObservable;
        this.user = user;

    }

    @Override
    public void update() {
        sendEmail(user, "product is in stock hurry");


    }

    private void sendEmail(String user, String msg) {

        System.out.println("mail sent to " + user);
    }
}
