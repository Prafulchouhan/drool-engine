package com.drool.droolApp.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Transaction {

    private int amount;

    private String sendCountry;

    public boolean isNewDevice() {
        return isNewDevice;
    }

    public void setNewDevice(boolean newDevice) {
        isNewDevice = newDevice;
    }

    public boolean isNewRecipientCountry() {
        return isNewRecipientCountry;
    }

    public void setNewRecipientCountry(boolean newRecipientCountry) {
        isNewRecipientCountry = newRecipientCountry;
    }

    public boolean isLiabilityShiftPass() {
        return isLiabilityShiftPass;
    }

    public void setLiabilityShiftPass(boolean liabilityShiftPass) {
        isLiabilityShiftPass = liabilityShiftPass;
    }

    private String recipientCountry;

    private String sendCurrency;

    private String recieveCurrency;


    private String binNumber;

    private String cardCountry;

    private String paymentMethod;

    private Boolean firstPaid;

    private int timeSinceFirstTransaction;

    private String threeDsCheck;

    private int totalTransactionInTwelveHours;

    private int newCardsAddedInADay;

    private String cardIssuer;

    private int newCardsAddedInLastThreeDays;

    private int daysSinceFirstTransaction;

    private int mlScore;

    private int daysSinceSignUp;

    private String cardBin;

    private String deviceType;

    private boolean avsFail;

    private boolean isNewDevice;

   private boolean isNewRecipientCountry;

   private String emailDomain;

   private String cardIssuerCountry;

   private boolean isLiabilityShiftPass;


//    sendCountry == "US",
//    amount>200,
//    deviceType == "mobile",
//    daysSinceFirstTransaction >100,
//    avsFail == true,
//    newCardsAddedInADay>1,
//    isNewDevice == true,
//    isNewRecipientCountry == true

//    untry = US
//User device type = mobile
//100+ days since user placed their 1st transaction
//Transaction value > £200
//Failed AVS on debit/credit card used
//User added 1 or more new debit/credit cards within last 24 hours
//Transaction created on a device that the user has not transacted from previously (or within last X days)
//Transaction receive country is not a country that the user has sent to previously (or within last X days)
}