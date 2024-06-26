package vn.fis.spro.customer.application.utils;


import lombok.extern.log4j.Log4j2;
import vn.fis.spro.customer.application.exceptions.BusinessCode;
import vn.fis.spro.customer.application.exceptions.BusinessException;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Log4j2
public class CryptoAlgorithmUtils {
    private CryptoAlgorithmUtils() {
    }

    public static String md5(String content) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");

            byte[] messageDigest = md.digest(content.getBytes());

            BigInteger no = new BigInteger(1, messageDigest);

            String hashText = no.toString(16);

            return hashText.toUpperCase();
        } catch (NoSuchAlgorithmException e) {
            log.error("Exception at function md5 with {}", e.getCause().toString());
            throw new BusinessException(BusinessCode.INTERNAL_SERVER_ERROR);
        }
    }
}
