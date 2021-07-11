package com.test.coursecatalog;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.Test;

class ArchTest {

    @Test
    void servicesAndRepositoriesShouldNotDependOnWebLayer() {
        JavaClasses importedClasses = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages("com.test.coursecatalog");

        noClasses()
            .that()
            .resideInAnyPackage("com.test.coursecatalog.service..")
            .or()
            .resideInAnyPackage("com.test.coursecatalog.repository..")
            .should()
            .dependOnClassesThat()
            .resideInAnyPackage("..com.test.coursecatalog.web..")
            .because("Services and repositories should not depend on web layer")
            .check(importedClasses);
    }
}
