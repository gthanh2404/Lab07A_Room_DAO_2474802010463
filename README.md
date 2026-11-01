# Lab 07A – Room Entity & DAO Construction

| File | Purpose |
|------|---------|
| `app/build.gradle.kts` | KSP plugin + Room 2.6.1 + LiveData dependencies |
| `data/local/ProductEntity.kt` | `@Entity(tableName = "products")` with `id`, `product_name`, `product_price`, `stock_quantity` |
| `data/local/ProductDao.kt` | `insertProduct`, `deleteProduct` (suspend), `getAllProducts` (LiveData), `getProductById` (suspend) |
| `data/local/AppDatabase.kt` | Bonus: `@Database` so Room's compiler validates the DAO |

Tech: Kotlin 2.0.21, KSP 2.0.21-1.0.27, AGP 8.7.3, compileSdk 35, minSdk 24.
