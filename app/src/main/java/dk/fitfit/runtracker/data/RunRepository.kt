package dk.fitfit.runtracker.data

import androidx.lifecycle.LiveData
import dk.fitfit.runtracker.data.db.RunDao
import dk.fitfit.runtracker.data.db.RunEntity

private const val TAG = "RunRepository"

class RunRepository(private val runDao: RunDao) {
    fun getRuns(): LiveData<List<RunEntity>> = runDao.getRuns()
}