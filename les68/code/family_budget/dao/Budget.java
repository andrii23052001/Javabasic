package family_budget.dao;

import family_budget.model.Purchase;

import java.time.LocalDate;

public interface Budget {
    boolean addPurchase(Purchase purchase);//Покупка

    double calcBudget();

    double budgetByPerson(String person);

    double budgetByStore(String store);

    double budgetByPeriod(LocalDate from,LocalDate to);

    double addMoney(double money);
    boolean checkBudget(Purchase purchase);//Бюджет
    double checkMoney(Purchase purchase);
}
