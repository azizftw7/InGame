package com.example.ingame.model;

public enum AttendanceStatus {

        PRESENT("Present"),
        ABSENT("Absent"),
        EXCUSED("Excused"),
        LATE("Late");

        private final String label;

        AttendanceStatus(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }


}
