package io.siencode.infrastructure.user.model;


import java.util.Optional;

public enum Role {

    PRODUCT_MODIFICATION,
    PRODUCT_GROUP_MODIFICATION,
    USER_MODIFICATION,
    EMPLOYEE_MODIFICATION,
    EMPLOYEE_ROLE_MODIFICATION,
    SCHEDULE_MODIFICATION,
    SHIFT_MODIFICATION;

    public static Optional<Role> getUserRoleById(final int id) {
        try {
            final Role role = Role.values()[id];
            return Optional.of(role);
        } catch (ArrayIndexOutOfBoundsException e) {
            return Optional.empty();
        }
    }

}
