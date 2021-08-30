package observe_pattern.entity;
//import observe_pattern.event.builder;

import observe_pattern.event.builder;

public class Account {
    private String name;
    private String phone;
    private String email;

    public Account(AccountBuilder accountBuilder) {
        this.name = accountBuilder.name;
        this.phone = accountBuilder.phone;
        this.email = accountBuilder.email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static AccountBuilder Builder(){
        return new AccountBuilder();
    }


    public static class AccountBuilder implements builder<Account>

    {
        private String name;
        private String phone;
        private String email;

        public AccountBuilder name(String name) {
            this.name = name;

            return this;
        }
        public AccountBuilder phone(String phone){
            this.phone = phone;

            return this;
        }


        public AccountBuilder email(String email) {
            this.email = email;

            return this;
        }

        @Override
        public Account build() {
            return new Account(this);
        }
    }
}
