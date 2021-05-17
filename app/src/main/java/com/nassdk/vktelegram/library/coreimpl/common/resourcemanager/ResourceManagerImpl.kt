package com.nassdk.vktelegram.library.coreimpl.common.resourcemanager

import android.content.Context
import com.nassdk.vktelegram.library.coreapi.common.resourcemanager.ResourceManager
import javax.inject.Inject

class ResourceManagerImpl @Inject constructor(
    private val context: Context
) : ResourceManager {
    override fun getString(resId: Int) = context.getString(resId)
    override fun getString(resId: Int, vararg formatArg: Any) = context.getString(resId, formatArg)
}