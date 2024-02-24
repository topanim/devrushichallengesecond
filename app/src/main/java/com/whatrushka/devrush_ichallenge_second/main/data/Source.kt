package com.whatrushka.devrush_ichallenge_second.main.data

import com.whatrushka.devrush_ichallenge_second.R
import com.whatrushka.devrush_ichallenge_second.main.data.models.Author
import com.whatrushka.devrush_ichallenge_second.main.data.models.Work

val source = listOf<Author>(
    Author(
        name = "Pablo Picasso",
        image = R.drawable.picasso_image,
        bio = "Pablo Ruiz y Picasso (25 October 1881 вЂ“ 8 April 1973), also known as Pablo Picasso, was a Spanish painter, sculptor, printmaker, ceramicist, stage designer, poet and playwright who spent most of his adult life in France.",
        works = listOf(
            Work(
                title = "Guernica",
                desc = "Guernica is a mural-sized oil painting on canvas by Spanish artist Pablo Picasso completed by June 1937. The painting, which uses a palette of gray, black, and white, is regarded by many art critics as one of the most moving and powerful anti-war paintings in history. Standing at 3.49 metres (11 ft 5 in) tall and 7.76 metres (25 ft 6 in) wide, the large mural shows the suffering of people, animals, and buildings wrenched by violence and chaos.",
                image = R.drawable.picasso1
            ),
            Work(
                title = "The Weeping Woman",
                desc = "The Weeping Woman, (60 С… 49 cm, 23 в…ќ С… 19 Вј inches) is an oil on canvas painted by Pablo Picasso in France in 1937. Picasso was intrigued with the subject, and revisited the theme numerous times that year. This painting was the final and most elaborate of the series. It has been in the collection of the Tate in London since 1987, and is on exhibition at the Tate Modern, London.",
                image = R.drawable.picasso2
            ),
            Work(
                title = "L'Homme aux cartes (Card Player)",
                desc = "1913вЂ“14, L'Homme aux cartes (Card Player), oil on canvas, 108 Г— 89.5 cm, Museum of Modern Art, New York",
                image = R.drawable.picasso3
            ),
            Work(
                title = "Asleep",
                desc = "The model of this painting, Asleeep, painted in 1932, is Picasso's mistress Marie Therese. She was resting between the two powerful polarized color blocks of red and green, which accentuate the tranquility of Marie Therese while sleeping. The solid black outline around the Marie's hands and profile is a feature of the series recalling the Fauvist's black binding of color blocks.(PabloPicasso.org)",
                image = R.drawable.picasso4
            )
        )
    ),
    Author(
        name = "Vincent van Gogh",
        image = R.drawable.vangogh_image,
        bio = "Vincent Willem van Gogh (30 March 1853 вЂ“ 29 July 1890) was a Dutch post-Impressionist painter whose work had far-reaching influence on 20th-century art.",
        works = listOf(
            Work(
                title = "The Starry Night",
                desc = "The Starry Night is an oil on canvas by the Dutch post-impressionist painter Vincent van Gogh. Painted in June 1889, it depicts the view from the east-facing window of his asylum room at Saint-RГ©my-de-Provence, just before sunrise, with the addition of an idealized village. It has been in the permanent collection of the Museum of Modern Art in New York City since 1941, acquired through the Lillie P. Bliss Bequest. It is regarded as among Van Gogh's finest works, and is one of the most recognized paintings in the history of Western culture.",
                image = R.drawable.vangogh1
            ),
            Work(
                title = "Sunflowers",
                desc = "Sunflowers (original title, in French: Tournesols) are the subject of two series of still life paintings by the Dutch painter Vincent van Gogh. The earlier series executed in Paris in 1887, depicts the flowers lying on the ground, while the second set executed a year later in Arles shows bouquets of sunflowers in a vase. In the artist's mind both sets were linked by the name of his friend Paul Gauguin, who acquired two of the Paris versions. ",
                image = R.drawable.vangogh2
            ),
            Work(
                title = "Bedroom in Arles",
                desc = "Bedroom in Arles (French: La Chambre Г Arles; Dutch: Slaapkamer te Arles) is the title given to each of three similar paintings by 19th-century Dutch Post-Impressionist painter Vincent van Gogh. Van Gogh's own title for this composition was simply The Bedroom (French: La Chambre Г  coucher). There are three authentic versions described in his letters, easily discernible from one another by the pictures on the wall to the right.",
                image = R.drawable.vangogh3
            ),
            Work(
                title = "Irises",
                desc = "Irises is one of many paintings and prints of irises by the Dutch artist Vincent van Gogh. Irises was painted while Vincent van Gogh was living at the asylum at Saint Paul-de-Mausole in Saint-RГ©my-de-Provence, France, in the last year before his death in 1890. It was painted before his first attack at the asylum.",
                image = R.drawable.vangogh4
            )
        )
    ),
    Author(
        name = "Frida Kahlo",
        image = R.drawable.frida_image,
        bio = "Frida Kahlo de Rivera (July 6, 1907 вЂ“ July 13, 1954), born Magdalena Carmen Frieda Kahlo y CalderГіn, was a Mexican painter known for her self-portraits.",
        works = listOf(
            Work(
                title = "Roots",
                desc = " In 2006, Kahlo's 1943 painting Roots set a US$ 5.6 million auction record for a Latin American work",
                image = R.drawable.frida1
            ),
            Work(
                title = "Self-Portrait with Thorn Necklace and Hummingbird",
                desc = "Self-Portrait with Thorn Necklace and Hummingbird (Autorretrato con Collar de Espinas in Spanish) is a 1940 painting by Mexican painter Frida Kahlo. Kahlo painted the self-portrait after her divorce from Diego Rivera and the end of her affair with photographer Nickolas Muray. The painting depicts Kahlo wearing a white dress with a monkey on her right shoulder and a cat on her left, wearing a necklace made of thorns and a dead hummingbird. The thorns dig into Kahlo's skin, making her bleed.",
                image = R.drawable.frida2
            ),
            Work(
                title = "Self Portrait with Cropped Hair",
                desc = "Kahlo cut her hair short a month after her divorce from fellow artist Diego Rivera, and she painted this self-portrait soon after. Here she depicted herself wearing an oversized menвЂ™s suit and crimson shirtвЂ”possibly RiveraвЂ™sвЂ”instead of one of the traditional Mexican dresses that she is often shown wearing. (moma.org)",
                image = R.drawable.frida3
            ),
            Work(
                title = "Fruit Of Life",
                desc = "In the early fifties and in her last days, Frida painted chiefly still lifes. During this period she was in such pain that she was unable to leave the house or even, at times, her bed. Her still life paintings usually show the fruits from her garden or the local market which she would arrange on her bedside table. She would often politicize her still life paintings by adding flags, inscriptions or a peace dove as she has done in this painting. (fridakahlofans.com)",
                image = R.drawable.frida4
            )
        )
    ),

    Author(
        name = "Georgia O'Keeffe",
        image = R.drawable.georgia_image,
        bio = "Georgia Totto O'Keeffe (November 15, 1887 вЂ“ March 6, 1986) was an American artist. She is best known for her paintings of enlarged flowers, New York skyscrapers, and New Mexico landscapes. O'Keeffe has been recognized as the 'Mother of American modernism'.",
        works = listOf(
            Work(
                title = "Oriental Poppies",
                desc = "Flowers fascinated Georgia and they were her favorite subject on canvas. She seems to have liked particular flowers - the calla lily, poppy, canna, iris, petunia, and jimson weed. O'Keeffe painted Oriental Poppies in 1928. This stunning work was declared a groundbreaking, art masterpiece. (georgiaokeeffe.net)",
                image = R.drawable.georgia1
            ),
            Work(
                title = "Jimson Weed, White Flower No. 1",
                desc = "Jimson Weed is an oil on linen painting by American artist Georgia O'Keeffe from 1936, located in the Indianapolis Museum of Art, which is in Indianapolis, Indiana, USA. It depicts four large blossoms of jimson weed, or datura.",
                image = R.drawable.georgia2
            ),
            Work(
                title = "Sky Above Clouds IV",
                desc = "Among the most dramatic and well-known images of O'Keeffe's later years are her cloudscapes of the 1960s and '70s. Traveling around the world, she was exhilarated by the views seen from an airplane window. She described the changing patterns and colors as 'breathtaking' and was moved to interpret these sights and feelings in paint. ",
                image = R.drawable.georgia3
            ),
            Work(
                title = "Radiator Building вЂ” Night, New York",
                desc = "This painting illustrates O'Keeffe's skill in articulating architectural structures as well as her use of the highly realistic, yet simplified style of Precisionism. She uses the night backdrop to incorporate a play between structure and light, and between the straight lines of the architectural forms and the ethereal smoke, which is reminiscent of the folds of flowers. O'Keeffe's portrait of the Radiator Building, an Art Deco skyscraper that was completed just three years prior to the painting, presents an iconic image that captures the changing skyline of New York City that O'Keeffe often found claustrophobic. (theartstory.org)",
                image = R.drawable.georgia4
            )
        )
    ),
    Author(
        name = "Andy Warhol",
        image = R.drawable.andy_image,
        bio = "Andy Warhol (August 6, 1928 вЂ“ February 22, 1987), born Andrew Warhola, was an American artist who was a leading figure in the visual art movement known as pop art.",
        works = listOf(
            Work(
                title = "Marilyn Diptych",
                desc = "The Marilyn Diptych (1962) is a silkscreen painting by American pop artist Andy Warhol. The piece is one of the artist's most famous works, and it has been praised by several cultural critics such as Camille Paglia and others. The original piece is currently owned by the Tate. Noticed qualities in the painting is how the top right panel has faded , this was done to show Marylin's more mortal and realistic features .",
                image = R.drawable.andy1
            ),
            Work(
                title = "CampbellвЂ™s Soup Cans",
                desc = "Campbell's Soup Cans, which is sometimes referred to as 32 Campbell's Soup Cans, is a work of art produced in 1962 by Andy Warhol. It consists of thirty-two canvases, each measuring 20 inches (51 cm) in height Г— 16 inches (41 cm) in width and each consisting of a painting of a Campbell's Soup canвЂ”one of each of the canned soup varieties the company offered at the time.",
                image = R.drawable.andy2
            ),
            Work(
                title = "Eight Elvises",
                desc = "Eight Elvises is a 1963 silkscreen painting by American pop artist Andy Warhol. In 2008 it was sold for $100 million to a private buyer, making the painting the most valuable work by Andy Warhol at the time. The current owner and location of the painting, which has not been seen publicly since the 1960s, are unknown.",
                image = R.drawable.andy3
            ),
            Work(
                title = "Self-Portrait",
                desc = "Comprising solely of a flat, vibrant fiery-red silkscreen image of Warhol emblazoned like a single and dramatic paint-splash over the black void of the canvas, this vast, nearly three-metre-square Self-Portrait is an imposing, haunting and ultimately poignant work from Warhol's great last series of self-portraits made in 1986. (wikiart.org)",
                image = R.drawable.andy4
            )
        )
    ),
    Author(
        name = "Leonardo da Vinci",
        image = R.drawable.leonardo_image,
        bio = "Leonardo di ser Piero da Vinci, more commonly Leonardo da Vinci (15 April 1452 вЂ“ 2 May 1519), was an Italian polymath whose areas of interest included invention, painting, sculpting, architecture, science, music, mathematics, engineering, literature, anatomy, geology, astronomy, botany, writing, history, and cartography. He has been variously called the father of paleontology, ichnology, and architecture, and is widely considered one of the greatest painters of all time.",
        works = listOf(
            Work(
                title = "Mona Lisa",
                desc = "The Mona Lisa is a half-length portrait of a woman by the Italian artist Leonardo da Vinci, which has been acclaimed as 'the best known, the most visited, the most written about, the most sung about, the most parodied work of art in the world'",
                image = R.drawable.leonardo1
            ),
            Work(
                title = "The Last Supper",
                desc = "The Last Supper is a late 15th-century mural painting by Leonardo da Vinci in the refectory of the Convent of Santa Maria delle Grazie, Milan. It is one of the world's most famous paintings.",
                image = R.drawable.leonardo2
            ),
            Work(
                title = "Lady with an Ermine",
                desc = "Lady with an Ermine is a painting by Leonardo da Vinci from around 1489вЂ“1490. The subject of the portrait is Cecilia Gallerani, and painted at a time when she was the mistress of Ludovico Sforza, Duke of Milan, and Leonardo was in the service of the Duke. The painting is one of only four portraits of women painted by Leonardo, the others being the Mona Lisa, the portrait of Ginevra de' Benci, and La belle ferronniГЁre.",
                image = R.drawable.leonardo3
            ),
            Work(
                title = "The Battle of Anghiari",
                desc = "The Battle of Anghiari (1505) is a lost painting by Leonardo da Vinci, at times referred to as 'The Lost Leonardo', which some commentators believe to be still hidden beneath one of the later frescoes in the Salone dei Cinquecento (Hall of the Five Hundred) in the Palazzo Vecchio, Florence. Its central scene depicted four men riding raging war horses engaged in a battle for possession of a standard, at the Battle of Anghiari in 1440.",
                image = R.drawable.leonardo4
            )
        )
    ),
    Author(
        name = "Rembrandt",
        image = R.drawable.rembrandt_image,
        bio = "Rembrandt Harmenszoon van Rijn (15 July 1606 вЂ“ 4 October 1669) was a Dutch painter and etcher. He is generally considered one of the greatest painters and printmakers in European art and the most important in Dutch history.",
        works = listOf(
            Work(
                title = "Belshazzar's Feast",
                desc = "Belshazzar's Feast is a painting by Rembrandt housed in the National Gallery, London. The painting is an attempt to establish Rembrandt as a painter of large, baroque history paintings.",
                image = R.drawable.rembrandt1
            ),
            Work(
                title = "The Night Watch",
                desc = "Militia Company of District II under the Command of Captain Frans Banninck Cocq, also known as The Shooting Company of Frans Banning Cocq and Willem van Ruytenburch, but commonly referred to as The Night Watch (Dutch: De Nachtwacht), is a 1642 painting by Rembrandt van Rijn. It is in the collection of the Amsterdam Museum but is prominently displayed in the Rijksmuseum as the best known painting in its collection.",
                image = R.drawable.rembrandt2
            ),
            Work(
                title = "Syndics of the Drapers' Guild",
                desc = "The Sampling Officials (Dutch: De Staalmeesters), also called Syndics of the Drapers' Guild, is a 1662 oil painting by Rembrandt. It is currently owned by the Rijksmuseum in Amsterdam. It has been described as his 'last great collective portrait'.",
                image = R.drawable.rembrandt3
            ),
            Work(
                title = "Jacob de Gheyn III",
                desc = "Jacob de Gheyn III, also known as Jacob III de Gheyn (1596вЂ“1641), was a Dutch Golden Age engraver, son of Jacob de Gheyn II, canon of Utrecht (city), and the subject of a 1632 oil painting by Rembrandt. The portrait is half of a pair of pendent portraits. The other piece is a portrait of de Gheyn's friend Maurits Huygens, wearing similar clothing (ruffs and black doublets) and facing the opposite direction.",
                image = R.drawable.rembrandt4
            )
        )
    )
)