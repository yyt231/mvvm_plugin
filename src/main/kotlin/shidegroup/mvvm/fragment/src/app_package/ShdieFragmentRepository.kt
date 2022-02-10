package shidegroup.mvvm.fragment.src.app_package


fun ShideFragmentRepository(
        packageName:String,
        fragmentClass:String
)="""
package ${packageName}

import androidx.lifecycle.MutableLiveData
import com.shidegroup.baselib.base.basemvvm.BaseRepository
import com.shidegroup.baselib.base.basemvvm.BaseViewModel
import com.shidegroup.baselib.net.exception.ShideApiException
import kotlinx.coroutines.CoroutineScope

class ${fragmentClass}Repository(
    baseViewModel: BaseViewModel,
    coroutineScope: CoroutineScope,
    errorLiveData: MutableLiveData<ShideApiException>
) : BaseRepository(baseViewModel, coroutineScope, errorLiveData) {
}
"""