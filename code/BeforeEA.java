int getField(TransactionInfo tInfo) {
    AccountDetails tmp = new AccountDetails();
    tmp.accountID = tInfo.debitAccount.accountID;
    int ret = tmp.accountID;
    return ret;
}
