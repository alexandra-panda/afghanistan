package com.company;
//incapsularea
    class Tancuri {
        private int numarul = 50;
        private String denumirea;
        private double greutatea;

        Tancuri(String denumire, double greutate) {
            this.denumirea=denumirea;
            this.greutatea=greutatea;
        }
        //get
        public String getDenumirea()    {
            return this.denumirea; }

        public double getGreutatea(){
            return this.greutatea;
        }
        //set
        public void setDenumirea(String denumirea){
            this.denumirea=denumirea;
        }

        public void setGreutatea(double greutatea){
            this.greutatea=greutatea;
        }

    }
