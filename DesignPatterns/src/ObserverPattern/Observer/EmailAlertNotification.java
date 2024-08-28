package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class EmailAlertNotification implements NotificationAlertObserver {

    StocksObservable stocksObservable;
    String email;

    public EmailAlertNotification(String email, StocksObservable stocksObservable) {
        this.stocksObservable = stocksObservable;
        this.email = email;

    }

    @Override
    public void update() {
        sendEmail(email, "product is in stock hurry");

    }

    private void sendEmail(String email, String msg) {

        System.out.println("mail sent to " + email);
    }
}
