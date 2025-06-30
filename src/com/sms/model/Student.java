package com.sms.model;

public class Student {


        private int sno;
        private String sname;
        private String sadd;

        public void setSadd(String sadd) {
            this.sadd = sadd;
        }

        public void setSname(String sname) {
            this.sname = sname;
        }

        public void setSno(int sno) {
            this.sno = sno;
        }

        public String getSadd() {
            return sadd;
        }

        public String getSname() {
            return sname;
        }

        public int getSno() {
            return sno;
        }
    }

