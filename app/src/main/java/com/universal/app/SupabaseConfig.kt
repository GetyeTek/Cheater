package com.universal.app

object SupabaseConfig {
    const val PROJECT_ID = "vlzgfaqrnyiqfxxxvtas"
    const val BASE_URL = "https://$PROJECT_ID.supabase.co"
    const val ANON_KEY = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6InZsemdmYXFybnlpcWZ4eHh2dGFzIiwicm9sZSI6ImFub24iLCJpYXQiOjE3NjU1NTk5NDAsImV4cCI6MjA4MTEzNTk0MH0.y93d68JWyGL7NKXZEHLunAuayMEWw1K6yATFGLxkUxY"

    const val FUNCTION_URL = "$BASE_URL/functions/v1/upload-image"
    const val STORAGE_URL = "$BASE_URL/storage/v1/object/images/"
    const val REST_URL = "$BASE_URL/rest/v1/processed_images"
}
