package com.driver;

public class CurrentAccount extends BankAccount {
    private String tradeLicenseId;

    public CurrentAccount(String name, double balance, String tradeLicenseId) throws Exception {
        super(name, balance, 5000);
        this.tradeLicenseId = tradeLicenseId;
    }

    public void validateLicenseId() throws Exception {
        if (tradeLicenseId == null || tradeLicenseId.length() < 2) {
            throw new Exception("Valid License cannot be generated");
        }

        char[] chars = tradeLicenseId.toCharArray();
        boolean valid = true;

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                valid = false;
                break;
            }
        }

        if (!valid) {
            rearrangeLicenseId();
        }
    }

    private void rearrangeLicenseId() {
        char[] chars = tradeLicenseId.toCharArray();

        for (int i = 1; i < chars.length; i += 2) {
            if (i + 1 < chars.length) {
                char temp = chars[i];
                chars[i] = chars[i + 1];
                chars[i + 1] = temp;
            }
        }

        tradeLicenseId = new String(chars);
    }

    public String getTradeLicenseId() {
        return tradeLicenseId;
    }
}
