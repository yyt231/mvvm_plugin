package other.mvvm.activity.src.app_package


fun ShideRepository(
        packageName:String,
        activityClass:String
)="""
package ${packageName}

import androidx.lifecycle.MutableLiveData
import com.shidegroup.baselib.base.basemvvm.BaseRepository
import com.shidegroup.baselib.base.basemvvm.BaseViewModel
import com.shidegroup.baselib.net.exception.ShideApiException
import kotlinx.coroutines.CoroutineScope

class ${activityClass}Repository(
    baseViewModel: BaseViewModel,
    coroutineScope: CoroutineScope,
    errorLiveData: MutableLiveData<ShideApiException>
) : BaseRepository(baseViewModel, coroutineScope, errorLiveData) {
}
"""