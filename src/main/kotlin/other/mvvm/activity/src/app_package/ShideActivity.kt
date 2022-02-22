package other.mvvm.activity.src.app_package

fun ShideAcitivityKt(
        applicationPackage:String?,
        activityClass:String,
        layoutName:String,
        packageName:String
)="""
package ${packageName}
import android.os.Bundle
import com.shidegroup.baselib.base.BaseActivity
import com.alibaba.android.arouter.facade.annotation.Route
import ${applicationPackage}.R
import ${applicationPackage}.BR;
import ${applicationPackage}.databinding.Activity${activityClass}Binding
import kotlinx.android.synthetic.main.${layoutName}.*

@Route(path = ******)
class ${activityClass}Activity : BaseActivity<${activityClass}ViewModel, Activity${activityClass}Binding>() {
    override fun getContentView(): Int {
        return R.layout.${layoutName}
    }

    override fun init(savedInstanceState: Bundle?) {
        super.init(savedInstanceState)
        isShowTopBar = false
    }

    override fun initViewModel() {
        viewModel = ${activityClass}ViewModel()
    }
    /**
     *	监听数据的变化
     */
    override fun observe() {

    }
    
    /**
     *  控件的点击事件
     */
    override fun onClick() {
    }

    override fun initData() {
        super.initData()
    }
    override fun initVariableId(): Int {
        TODO("Not yet implemented")
    }

   
} 
"""