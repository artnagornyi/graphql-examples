package com.nagornyi.graphqlplayground;

import com.distelli.graphql.apigen.ApiGenMojo;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.util.ReflectionUtils;

public class Generator {

    public static void main(String[] args) {
        ApiGenMojo apiGenMojo = new ApiGenMojo();
        ReflectionTestUtils.setField(apiGenMojo, "defaultPackageName", "com.nagornyi.dto");
        apiGenMojo.execute();
    }
}
