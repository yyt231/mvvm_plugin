package shidegroup.mvvm.activity

import com.android.tools.idea.wizard.template.ModuleTemplateData
import com.android.tools.idea.wizard.template.RecipeExecutor
import shidegroup.mvvm.activity.res.layout.mvvmActivityXml
import shidegroup.mvvm.activity.src.app_package.ShideAcitivityKt
import shidegroup.mvvm.activity.src.app_package.ShideRepository
import shidegroup.mvvm.activity.src.app_package.ShideViewModel


fun RecipeExecutor.ShideActivityRecipe(
        moduleData: ModuleTemplateData,
        activityClass: String,
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

    val mvvmActivity = ShideAcitivityKt(projectData.applicationPackage, activityClass, layoutName, packageName)
    // 保存Activity
    save(mvvmActivity, srcOut.resolve("${activityClass}Activity.${ktOrJavaExt}"))
    // 保存xml
    save(mvvmActivityXml(packageName, activityClass), resOut.resolve("layout/${layoutName}.xml"))
    // 保存viewmodel
    save(ShideViewModel(packageName, activityClass), srcOut.resolve("${activityClass}ViewModel.${ktOrJavaExt}"))
    // 保存repository
    save(ShideRepository(packageName, activityClass), srcOut.resolve("${activityClass}Repository.${ktOrJavaExt}"))
}