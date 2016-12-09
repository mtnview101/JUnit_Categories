package core;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;;

													/*@RunWith(Suite.class)
													@SuiteClasses({ AppTest.class })*/

@RunWith(Categories.class)
@IncludeCategory({RegressionTest.class,AcceptanceTest.class})
//@ExcludeCategory(AcceptanceTest.class)
@SuiteClasses({AppTest.class})
public class AllTests {

}
