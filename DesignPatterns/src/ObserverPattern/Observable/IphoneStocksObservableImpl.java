package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStocksObservableImpl implements StocksObservable {

    public List<NotificationAlertObserver> notificationAlertObserverList = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) {
        this.notificationAlertObserverList.add(notificationAlertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
        this.notificationAlertObserverList.remove(notificationAlertObserver);

    }

    @Override
    public void notifySubscribers() {

        for (NotificationAlertObserver notificationAlertObserver : notificationAlertObserverList) {
            notificationAlertObserver.update();
        }
    }

    @Override
    public void setStockCount(int newStock) {

        if (stockCount == 0) {
            notifySubscribers();
        }

        stockCount += newStock;


    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
