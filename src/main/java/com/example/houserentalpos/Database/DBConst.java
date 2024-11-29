package com.example.houserentalpos.Database;



public class DBConst {

    public static final String DATABASE_NAME = "TalabiPOS";

    // Property Table
    public static final String PROPERTY_TABLE = "property";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_NAME = "property_name";
    public static final String PROPERTY_LOCATION = "location";
    public static final String PROPERTY_TYPE = "type";
    public static final String PROPERTY_MONTHLY_RENT = "monthly_rent";
    public static final String PROPERTY_AVAILABILITY = "availability";

    // Tenant Table
    public static final String TENANT_TABLE = "tenant";
    public static final String TENANT_ID = "id";
    public static final String TENANT_NAME = "name";
    public static final String TENANT_CONTACT_INFO = "contact_info";
    public static final String TENANT_EMAIL = "email";
    public static final String TENANT_LOYALTY_POINTS = "loyalty_points";

    // Payment Table
    public static final String PAYMENT_TABLE = "payment";
    public static final String PAYMENT_ID = "id";
    public static final String PAYMENT_TENANT_ID = "tenant_id";
    public static final String PAYMENT_AMOUNT = "amount";
    public static final String PAYMENT_DATE = "payment_date";
    public static final String PAYMENT_STATUS = "status";

    // Private constructor to prevent instantiation
    private DBConst() {
        // No need to instantiate this class
    }
}