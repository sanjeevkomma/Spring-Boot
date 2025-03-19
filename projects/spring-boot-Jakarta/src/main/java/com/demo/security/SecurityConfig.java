package com.demo.security;

import jakarta.security.enterprise.authentication.mechanism.http.BasicAuthenticationMechanismDefinition;
import jakarta.security.enterprise.identitystore.DatabaseIdentityStoreDefinition;

@BasicAuthenticationMechanismDefinition
@DatabaseIdentityStoreDefinition(
        dataSourceLookup = "jdbc/myDataSource",
        callerQuery = "SELECT password FROM users WHERE username = ?",
        groupsQuery = "SELECT role FROM user_roles WHERE username = ?"
)
public class SecurityConfig {
}

