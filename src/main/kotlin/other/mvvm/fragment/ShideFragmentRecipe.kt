package other.mvvm.fragment

import com.android.tools.idea.wizard.template.ModuleTemplateData
import com.android.tools.idea.wizard.template.RecipeExecutor
import other.mvvm.fragment.res.layout.ShideFragmentXml
import other.mvvm.fragment.src.app_package.ShideFragmentKt
import other.mvvm.fragment.src.app_package.ShideFragmentRepository
import other.mvvm.fragment.src.app_package.ShideFragmentViewModel


fun RecipeExecutor.ShideFragmentRecipe(
    moduleData: ModuleTemplateData,
    fragmentClass: String,
    layoutName: String,
    packageName: String
) {
    val (projectData, srcOut, resOut) = moduleData
    val ktOrJavaExt = projectData.language.extension
//    generateManifest(
//            moduleData = moduleData,
//            activityClass = "${activityClass}Activity",
//            activityTitle = activityClass,
//            packageName = packageName,
//            isLauncher = false,
//            hasNoActionBar = false,
//            generateActivityTitle = true,
//            requireTheme = false,
//            useMaterial2 = false
//    )

    val mvvmFragment = ShideFragmentKt(projectData.applicationPackage, fragmentClass, layoutName, packageName)
    // 保存fragment
//    save(mvvmFragment, srcOut.resolve("${fragmentClass}Fragment.${ktOrJavaExt}"))
    save(mvvmFragment, srcOut.resolve("${fragmentClass}Fragment.kt"))
    // 保存xml
    save(ShideFragmentXml(packageName, fragmentClass), resOut.resolve("layout/${layoutName}.xml"))
    // 保存viewmodel
//    save(ShideFragmentViewModel(packageName, fragmentClass), srcOut.resolve("${fragmentClass}ViewModel.${ktOrJavaExt}"))
    save(ShideFragmentViewModel(packageName, fragmentClass), srcOut.resolve("${fragmentClass}ViewModel.kt"))
    // 保存repository
    save(
        ShideFragmentRepository(packageName, fragmentClass),
//        srcOut.resolve("${fragmentClass}Repository.${ktOrJavaExt}")
        srcOut.resolve("${fragmentClass}Repository.kt")
    )
}