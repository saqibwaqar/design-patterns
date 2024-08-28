package ObserverPattern;

import ObserverPattern.Observable.IphoneStocksObservableImpl;
import ObserverPattern.Observable.StocksObservable;
import ObserverPattern.Observer.EmailAlertNotification;
import ObserverPattern.Observer.MobileAlertNotification;
import ObserverPattern.Observer.NotificationAlertObserver;
import StrategyPattern.WithStrategyPattern.SportsCar;
import StrategyPattern.WithStrategyPattern.Vehicle;

public class Main {
    public static void main(String[] args) {

        StocksObservable iphoneStocksObservable = new IphoneStocksObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertNotification("abc@gmail.com", iphoneStocksObservable);
        NotificationAlertObserver observer2 = new EmailAlertNotification("xyz@gmail.com", iphoneStocksObservable);
        NotificationAlertObserver observer3 = new MobileAlertNotification("cde", iphoneStocksObservable);


        iphoneStocksObservable.add(observer1);
        iphoneStocksObservable.add(observer2);
        iphoneStocksObservable.add(observer3);

        iphoneStocksObservable.setStockCount(10);

    }
}