/*
    This library is free software; you can redistribute it and/or
    modify it under the terms of the GNU General Public
    License as published by the Free Software Foundation; either
    version 2 of the license, or (at your option) any later version.
*/

package org.gjt.jclasslib.browser.config.classpath

import javax.swing.tree.DefaultTreeModel

interface ClasspathComponent {
    fun findClass(className: String): FindResult?
    fun mergeClassesIntoTree(model: DefaultTreeModel, reset: Boolean)
    fun addClasspathChangeListener(listener: ClasspathChangeListener)
    fun removeClasspathChangeListener(listener: ClasspathChangeListener)
}