package other.mvvm.activity.src.app_package


fun ShideViewModel(
        packageName:String,
        activityClass:String
)="""
package ${packageName}
import androidx.lifecycle.viewModelScope
import com.shidegroup.baselib.base.basemvvm.BaseViewModel
class ${activityClass}ViewModel : BaseViewModel() {
    private val repo by lazy { ${activityClass}Repository(this, viewModelScope, errorLiveData) }
}    
"""