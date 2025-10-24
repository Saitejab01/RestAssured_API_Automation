	package microWebServices_RequestChaining;
	
	import java.util.ArrayList;
	
	class BankAccount{
	    public String account_number;
	    public String name;
	    public String ifsc;
	    
		private BankAccount() {	}
	
		public BankAccount(String account_number, String name, String ifsc) {
			super();
			this.account_number = account_number;
			this.name = name;
			this.ifsc = ifsc;
		}
	
		public String getAccount_number() {
			return account_number;
		}
	
		public void setAccount_number(String account_number) {
			this.account_number = account_number;
		}
	
		public String getName() {
			return name;
		}
	
		public void setName(String name) {
			this.name = name;
		}
	
		public String getIfsc() {
			return ifsc;
		}
	
		public void setIfsc(String ifsc) {
			this.ifsc = ifsc;
		}
		
	    
	}
	
	class BillingAddress{
	    public String address_1;
	    public String street;
	    public String landmark;
	    public String area;
	    public String city;
	    public String state;
	    public String pincode;
	    public String address_type;
	    public String label;
		public BillingAddress(String address_1, String street, String landmark, String area, String city, String state,
				String pincode, String address_type, String label) {
			super();
			this.address_1 = address_1;
			this.street = street;
			this.landmark = landmark;
			this.area = area;
			this.city = city;
			this.state = state;
			this.pincode = pincode;
			this.address_type = address_type;
			this.label = label;
		}
		private BillingAddress() {	}
		public String getAddress_1() {
			return address_1;
		}
		public void setAddress_1(String address_1) {
			this.address_1 = address_1;
		}
		public String getStreet() {
			return street;
		}
		public void setStreet(String street) {
			this.street = street;
		}
		public String getLandmark() {
			return landmark;
		}
		public void setLandmark(String landmark) {
			this.landmark = landmark;
		}
		public String getArea() {
			return area;
		}
		public void setArea(String area) {
			this.area = area;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getPincode() {
			return pincode;
		}
		public void setPincode(String pincode) {
			this.pincode = pincode;
		}
		public String getAddress_type() {
			return address_type;
		}
		public void setAddress_type(String address_type) {
			this.address_type = address_type;
		}
		public String getLabel() {
			return label;
		}
		public void setLabel(String label) {
			this.label = label;
		}
	    
	}
	
	class CustomAttributes{
	    public String name;
	    public String place;
	    public String animal;
	    public String thing;
		public CustomAttributes(String name, String place, String animal, String thing) {
			super();
			this.name = name;
			this.place = place;
			this.animal = animal;
			this.thing = thing;
		}
		private CustomAttributes() {}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPlace() {
			return place;
		}
		public void setPlace(String place) {
			this.place = place;
		}
		public String getAnimal() {
			return animal;
		}
		public void setAnimal(String animal) {
			this.animal = animal;
		}
		public String getThing() {
			return thing;
		}
		public void setThing(String thing) {
			this.thing = thing;
		}
		
	    
	}
	
		class OrderLineItem{
	    public String sku_id;
	    public String title;
	    public String description;
	    public String image_url;
	    public int rate;
	    public String quantity;
	    public String amount_before_tax;
	    public String tax;
	    public String total_amount;
	    public ArrayList<String> serial_numbers;
		private OrderLineItem() {}
		public OrderLineItem(String sku_id, String title, String description, String image_url, int rate, String quantity,
				String amount_before_tax, String tax, String total_amount, ArrayList<String> serial_numbers) {
			super();
			this.sku_id = sku_id;
			this.title = title;
			this.description = description;
			this.image_url = image_url;
			this.rate = rate;
			this.quantity = quantity;
			this.amount_before_tax = amount_before_tax;
			this.tax = tax;
			this.total_amount = total_amount;
			this.serial_numbers = serial_numbers;
		}
		public String getSku_id() {
			return sku_id;
		}
		public void setSku_id(String sku_id) {
			this.sku_id = sku_id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getImage_url() {
			return image_url;
		}
		public void setImage_url(String image_url) {
			this.image_url = image_url;
		}
		public int getRate() {
			return rate;
		}
		public void setRate(int rate) {
			this.rate = rate;
		}
		public String getQuantity() {
			return quantity;
		}
		public void setQuantity(String quantity) {
			this.quantity = quantity;
		}
		public String getAmount_before_tax() {
			return amount_before_tax;
		}
		public void setAmount_before_tax(String amount_before_tax) {
			this.amount_before_tax = amount_before_tax;
		}
		public String getTax() {
			return tax;
		}
		public void setTax(String tax) {
			this.tax = tax;
		}
		public String getTotal_amount() {
			return total_amount;
		}
		public void setTotal_amount(String total_amount) {
			this.total_amount = total_amount;
		}
		public ArrayList<String> getSerial_numbers() {
			return serial_numbers;
		}
		public void setSerial_numbers(ArrayList<String> serial_numbers) {
			this.serial_numbers = serial_numbers;
		}
		
	    
	}
	class ShippingAddress{
	    public String address_1;
	    public String street;
	    public String landmark;
	    public String area;
	    public String city;
	    public String state;
	    public String pincode;
	    public String address_type;
	    public String label;
		private ShippingAddress() {
			super();
		}
		public ShippingAddress(String address_1, String street, String landmark, String area, String city, String state,
				String pincode, String address_type, String label) {
			super();
			this.address_1 = address_1;
			this.street = street;
			this.landmark = landmark;
			this.area = area;
			this.city = city;
			this.state = state;
			this.pincode = pincode;
			this.address_type = address_type;
			this.label = label;
		}
		public String getAddress_1() {
			return address_1;
		}
		public void setAddress_1(String address_1) {
			this.address_1 = address_1;
		}
		public String getStreet() {
			return street;
		}
		public void setStreet(String street) {
			this.street = street;
		}
		public String getLandmark() {
			return landmark;
		}
		public void setLandmark(String landmark) {
			this.landmark = landmark;
		}
		public String getArea() {
			return area;
		}
		public void setArea(String area) {
			this.area = area;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getPincode() {
			return pincode;
		}
		public void setPincode(String pincode) {
			this.pincode = pincode;
		}
		public String getAddress_type() {
			return address_type;
		}
		public void setAddress_type(String address_type) {
			this.address_type = address_type;
		}
		public String getLabel() {
			return label;
		}
		public void setLabel(String label) {
			this.label = label;
		}
	    
	}
	class User{
	    public String email;
	    public String first_name;
	    public String last_name;
	    public String country_code;
	    public String mobile_number;
		private User() {
			super();
		}
		public User(String email, String first_name, String last_name, String country_code, String mobile_number) {
			super();
			this.email = email;
			this.first_name = first_name;
			this.last_name = last_name;
			this.country_code = country_code;
			this.mobile_number = mobile_number;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getFirst_name() {
			return first_name;
		}
		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}
		public String getLast_name() {
			return last_name;
		}
		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}
		public String getCountry_code() {
			return country_code;
		}
		public void setCountry_code(String country_code) {
			this.country_code = country_code;
		}
		public String getMobile_number() {
			return mobile_number;
		}
		public void setMobile_number(String mobile_number) {
			this.mobile_number = mobile_number;
		}
	    
	}
	
	public class CreateOrderPOJO{
	    public int quantity;
	    public int amount_before_tax;
	    public int tax;
	    public int total_amount;
	    public User user;
	    public ShippingAddress shipping_address;
	    public BillingAddress billing_address;
	    public String currency;
	    public String invoice_id;
	    public String referrer_platform;
	    public String referrer_platform_version;
	    public String ip_address;
	    public String merchant_shopfront_domain;
	    public boolean offer_enabled;
	    public boolean validate_order_line_item;
	    public ArrayList<OrderLineItem> order_line_items;
	    public BankAccount bank_account;
	    public CustomAttributes custom_attributes;
		private CreateOrderPOJO() {
			super();
		}
		public CreateOrderPOJO(int quantity, int amount_before_tax, int tax, int total_amount, User user,
				ShippingAddress shipping_address, BillingAddress billing_address, String currency, String invoice_id,
				String referrer_platform, String referrer_platform_version, String ip_address,
				String merchant_shopfront_domain, boolean offer_enabled, boolean validate_order_line_item,
				ArrayList<OrderLineItem> order_line_items, BankAccount bank_account, CustomAttributes custom_attributes) {
			super();
			this.quantity = quantity;
			this.amount_before_tax = amount_before_tax;
			this.tax = tax;
			this.total_amount = total_amount;
			this.user = user;
			this.shipping_address = shipping_address;
			this.billing_address = billing_address;
			this.currency = currency;
			this.invoice_id = invoice_id;
			this.referrer_platform = referrer_platform;
			this.referrer_platform_version = referrer_platform_version;
			this.ip_address = ip_address;
			this.merchant_shopfront_domain = merchant_shopfront_domain;
			this.offer_enabled = offer_enabled;
			this.validate_order_line_item = validate_order_line_item;
			this.order_line_items = order_line_items;
			this.bank_account = bank_account;
			this.custom_attributes = custom_attributes;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public int getAmount_before_tax() {
			return amount_before_tax;
		}
		public void setAmount_before_tax(int amount_before_tax) {
			this.amount_before_tax = amount_before_tax;
		}
		public int getTax() {
			return tax;
		}
		public void setTax(int tax) {
			this.tax = tax;
		}
		public int getTotal_amount() {
			return total_amount;
		}
		public void setTotal_amount(int total_amount) {
			this.total_amount = total_amount;
		}
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
		public ShippingAddress getShipping_address() {
			return shipping_address;
		}
		public void setShipping_address(ShippingAddress shipping_address) {
			this.shipping_address = shipping_address;
		}
		public BillingAddress getBilling_address() {
			return billing_address;
		}
		public void setBilling_address(BillingAddress billing_address) {
			this.billing_address = billing_address;
		}
		public String getCurrency() {
			return currency;
		}
		public void setCurrency(String currency) {
			this.currency = currency;
		}
		public String getInvoice_id() {
			return invoice_id;
		}
		public void setInvoice_id(String invoice_id) {
			this.invoice_id = invoice_id;
		}
		public String getReferrer_platform() {
			return referrer_platform;
		}
		public void setReferrer_platform(String referrer_platform) {
			this.referrer_platform = referrer_platform;
		}
		public String getReferrer_platform_version() {
			return referrer_platform_version;
		}
		public void setReferrer_platform_version(String referrer_platform_version) {
			this.referrer_platform_version = referrer_platform_version;
		}
		public String getIp_address() {
			return ip_address;
		}
		public void setIp_address(String ip_address) {
			this.ip_address = ip_address;
		}
		public String getMerchant_shopfront_domain() {
			return merchant_shopfront_domain;
		}
		public void setMerchant_shopfront_domain(String merchant_shopfront_domain) {
			this.merchant_shopfront_domain = merchant_shopfront_domain;
		}
		public boolean isOffer_enabled() {
			return offer_enabled;
		}
		public void setOffer_enabled(boolean offer_enabled) {
			this.offer_enabled = offer_enabled;
		}
		public boolean isValidate_order_line_item() {
			return validate_order_line_item;
		}
		public void setValidate_order_line_item(boolean validate_order_line_item) {
			this.validate_order_line_item = validate_order_line_item;
		}
		public ArrayList<OrderLineItem> getOrder_line_items() {
			return order_line_items;
		}
		public void setOrder_line_items(ArrayList<OrderLineItem> order_line_items) {
			this.order_line_items = order_line_items;
		}
		public BankAccount getBank_account() {
			return bank_account;
		}
		public void setBank_account(BankAccount bank_account) {
			this.bank_account = bank_account;
		}
		public CustomAttributes getCustom_attributes() {
			return custom_attributes;
		}
		public void setCustom_attributes(CustomAttributes custom_attributes) {
			this.custom_attributes = custom_attributes;
		}
	
	}
