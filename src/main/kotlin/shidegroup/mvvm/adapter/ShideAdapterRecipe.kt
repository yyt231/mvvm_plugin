package shidegroup.mvvm.adapter

import com.android.tools.idea.wizard.template.ModuleTemplateData
import com.android.tools.idea.wizard.template.RecipeExecutor
import shidegroup.mvvm.adapter.app_package.ShideAdapterKt
import shidegroup.mvvm.fragment.res.layout.ShideFragmentXml


fun RecipeExecutor.ShideAdapterRecipe(
        moduleData: ModuleTemplateData,
        adapterClass: String,
        layoutName: String,
        packageName: String
) {
    val (projectData, srcOut, resOut) = moduleData
    val ktOrJavaExt = projectData.language.extension

    val mvvmAdapter = ShideAdapterKt(projectData.applicationPackage, adapterClass, layoutName, packageName)
    // 保存Adapter
    save(mvvmAdapter, srcOut.resolve("${adapterClass}Adapter.${ktOrJavaExt}"))
    // 保存xml
    save(ShideFragmentXml(packageName, adapterClass), resOut.resolve("layout/${layoutName}.xml"))

}