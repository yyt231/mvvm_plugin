package shidegroup.mvvm.fragment.src.app_package


fun ShideFragmentViewModel(
        packageName:String,
        fragmentClass:String
)="""
package ${packageName}
import androidx.lifecycle.viewModelScope
import com.shidegroup.baselib.base.basemvvm.BaseViewModel
class ${fragmentClass}ViewModel : BaseViewModel() {
    private val repo by lazy { ${fragmentClass}Repository(this, viewModelScope, errorLiveData) }
}    
"""