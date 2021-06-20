package io.siencode.infrastructure.user.domain;


import java.util.Optional;

public enum UserRole {

    PRODUCT_MODIFICATION,
    PRODUCT_GROUP_MODIFICATION,
    USER_MODIFICATION,
    EMPLOYEE_MODIFICATION,
    EMPLOYEE_ROLE_MODIFICATION,
    SCHEDULE_MODIFICATION,
    SHIFT_MODIFICATION;

    public static Optional<UserRole> getUserRoleById(final int id) {
        try {
            final UserRole userRole = UserRole.values()[id];
            return Optional.of(userRole);
        } catch (ArrayIndexOutOfBoundsException e) {
            return Optional.empty();
        }
    }

}
