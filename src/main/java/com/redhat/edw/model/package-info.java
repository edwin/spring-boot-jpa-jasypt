/**
 * <pre>
 *     com.redhat.edw.model.package-info
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 05 Mei 2020 12:00
 */
@TypeDefs({
        @TypeDef(
                name="encryptedString",
                typeClass= EncryptedStringType.class,
                parameters= {
                        @Parameter(name="encryptorRegisteredName", value="myStringEncryptor")
                }
        )
})
package com.redhat.edw.model;

import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import org.jasypt.hibernate5.type.EncryptedStringType;