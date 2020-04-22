package ro.ase.cts.test;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory(ImportantTest.class)
@SuiteClasses({LocomotiveConstructorTestCase.class, LocomotiveSetCurrentSpeedTestCase.class})
public class ImportantTestSuite {

}
