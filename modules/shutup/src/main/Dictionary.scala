package lila.shutup

/** - words are automatically pluralized. "tit" will also match "tits"
  * - words are automatically leetified. "tit" will also match "t1t", "t-i-t", and more.
  * - words do not partial match. "anal" will NOT match "analysis".
  */
private object Dictionary {

  def en = dict("""
    """
    )

  def ru =
    dict(
      """
"""
    )

  def es = dict("""
""")

  private def dict(words: String) = words.linesIterator.filter(_.nonEmpty)
}
