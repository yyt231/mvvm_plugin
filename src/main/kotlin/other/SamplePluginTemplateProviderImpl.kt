package other

import com.android.tools.idea.wizard.template.Template
import com.android.tools.idea.wizard.template.WizardTemplateProvider
import other.mvvm.activity.ShideActivityTemplate
import other.mvvm.fragment.ShideFragmentTemplate
import other.mvvm.adapter.ShideAdapterTemplate

/**
 *
 * @Description:
 * @Author:         杨彦韬
 * @CreateDate:     2021/1/20 10:38
 * @UpdateUser:     更新者：
 * @UpdateDate:     2021/1/20 10:38
 * @UpdateRemark:   更新说明：
 * @Version:        1.0
 */

class SamplePluginTemplateProviderImpl : WizardTemplateProvider() {

        override fun getTemplates(): List<Template> = listOf(ShideActivityTemplate, ShideFragmentTemplate, ShideAdapterTemplate)
//    override fun getTemplates(): List<Template> {
//        var currentDate = SimpleDateFormat.getDateInstance().format(Date())
//        println("currentDate:  $currentDate")
//
//        return listOf(ShideActivityTemplate, ShideFragmentTemplate, ShideAdapterTemplate)
//    }
}