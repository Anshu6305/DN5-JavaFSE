package com.cognizant.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingExample {

    private static final Logger logger =
            LoggerFactory.getLogger(ParameterizedLoggingExample.class);

    public static void main(String[] args) {

        String studentName = "Anshuman Routray";
        int rollNumber = 23052783;

        logger.info("Student Name: {}", studentName);

        logger.info("Roll Number: {}", rollNumber);

        logger.info("Student {} has roll number {}.",
                studentName, rollNumber);

    }

}