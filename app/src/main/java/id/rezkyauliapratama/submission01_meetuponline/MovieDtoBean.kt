package id.rezkyauliapratama.submission01_meetuponline

//data class (POJO)
data class MovieDtoBean(
    val id: Int,
    val overview: String,
    val popularity: Double,
    val posterPath: Int,
    val releaseDate: String,
    val title: String
)

//data class (POJO)
data class ListMoviesDto(
    val moviesDto: List<MovieDtoBean>
)
